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
