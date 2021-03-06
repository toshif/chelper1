$(document).ready(function() {
    $( "#power_x" ).keyup(function(event) {
        update_power();
    });
    $( "#power_y" ).keyup(function(event) {
        update_power();
    });

    $( "#fact_x" ).keyup(function(event) {
        update_factorial();
    });

    $( "#combi_x" ).keyup(function(event) {
        update_combination();
    });
    $( "#combi_y" ).keyup(function(event) {
        update_combination();
    });

    $( "#base_value" ).keyup(function(event) {
        update_base();
    });
    $( "#base_from" ).keyup(function(event) {
        update_base();
    });
    $( "#base_to" ).keyup(function(event) {
        update_base();
    });

});

function update_power(){
    x = parseInt($("#power_x").val());
    y = parseInt($("#power_y").val());
    ans = Math.pow(x, y);

    /*
    console.log("power_x = " + x);
    console.log("power_y = " + y);
    console.log("power_ans x^y = " + ans);
    */

    $("#power_ans").text(ans);
}

function update_factorial(){
    x = parseInt($("#fact_x").val());
    if (! (0 < x && x < 10000) ){
        // invalid input
        $("#fact_ans").text("invalid");
        return;
    }

    ans = factorial(x);
    $("#fact_ans").text(ans);
}

var fact_memo = [];
function factorial(n) {
    if (n == 0 || n == 1)
        return 1;
    if (fact_memo[n] > 0)
        return fact_memo[n];
    return fact_memo[n] = factorial(n-1) * n;
}

function update_combination(){
    if (combi_memo == null) {
        console.log("calc binomial combination ...");
        binomial_combination();
        console.log("calc binomial combination complete.");
    }

    x = parseInt($("#combi_x").val());
    y = parseInt($("#combi_y").val());

    if (! (0 <= x && x < 105) || ! (0 <= y && y < 105)){
        // invalid input
        $("#combi_ans").text("invalid");
        return;
    }

    ans = combi_memo[x][y];
    $("#combi_ans").text(ans);
}

var combi_memo = null;
function binomial_combination(){
    var N = 105;

    combi_memo = [];
    for(var i=0; i<N; i++) {
        combi_memo[i] = new Array(N);
    }

    for (var k = 1; k < N; k++) combi_memo[0][k] = 0;
    for (var n = 0; n < N; n++) combi_memo[n][0] = 1;

    for (var n = 1; n < N; n++)
       for (var k = 1; k < N; k++)
          combi_memo[n][k] = combi_memo[n-1][k-1] + combi_memo[n-1][k];
}

function update_base(){
    var x = parseInt($("#base_value").val(), $("#base_from").val());
    $("#base_ans").text(x.toString($("#base_to").val()));
}