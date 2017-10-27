Topcoder : Basic Geometory Concepts
* https://www.topcoder.com/community/data-science/data-science-tutorials/geometry-concepts-basic-concepts/
 
Sine Cosine Definition
* Sine: http://mathworld.wolfram.com/Sine.html
* Cosine: http://mathworld.wolfram.com/Cosine.html

Dot Product
* A.B = x1 * x2 + y1 * y2 = |A| |B| cos(|θ|)
* A B が直行している場合にゼロになる
* A B が平行している場合に最大になる
* A B が平行の時、同じ方向を向いているとき正、逆向きのとき負になる
 
Cross Product
* AxB = x1 * y2 - y1 * x2 = |A| |B| sin(θ)
* A B が直行している場合に最大になる
* A B が平行している場合にゼロになる
* AxB の絶対値は、A B が作る平衡四辺形の面積に等しい = |AxB|/2 は、A B が作る三角形の面積に等しい
* AxB の符号は、B が A に対して左回りにあると正、右回りにあると負になる

```java
    long dot(long x1, long y1, long x2, long y2) {
        return x1 * x2 + y1 * y2;
    }
    
    long cross(long x1, long y1, long x2, long y2) {
        return x1 * y2 - y1 * x2;
    }
```
 
 
