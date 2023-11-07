[1mdiff --git a/C Programming/roundOffToHundredths/main.c b/C Programming/roundOffToHundredths/main.c[m
[1mindex 0c86fad..37cc4fa 100644[m
[1m--- a/C Programming/roundOffToHundredths/main.c[m	
[1m+++ b/C Programming/roundOffToHundredths/main.c[m	
[36m@@ -1,21 +1,27 @@[m
 #include <stdio.h>[m
 [m
[31m-float roundOff(float num);[m
[32m+[m[32mdouble roundOff(double num);[m[41m[m
 [m
[31m-int main(int argc, char const *argv[])[m
[32m+[m[32mint main()[m[41m[m
 {[m
[31m-	float input, result;[m
[32m+[m	[32mdouble input, result;[m[41m[m
 	printf("Enter a number:\n");[m
[31m-	scanf("%f", &input);[m
[32m+[m	[32mscanf("%lf", &input);[m[41m[m
 [m
 	result = roundOff(input);[m
[31m-	printf("%f rounded off to the nearest hundredths is: %.2f\n", input, result);[m
[32m+[m	[32mprintf("%lf rounded off to the nearest hundredths is: %.6lf\n", input, result);[m[41m[m
 	return 0;[m
 }[m
 [m
[31m-float roundOff(float num){[m
[32m+[m[32mdouble roundOff(double num){[m[41m[m
[32m+[m	[32mif (num >= 0.05) {[m[41m[m
[32m+[m		[32mnum = num * 100;[m[41m[m
[32m+[m		[32mnum = (int) num / 100.0;[m[41m[m
[32m+[m		[32mnum += 0.01;[m[41m[m
[32m+[m	[32m}[m[41m[m
[32m+[m	[32melse {[m[41m[m
 	num = num * 100;[m
 	num = (int) num / 100.0;[m
[31m-[m
[32m+[m	[32m}[m[41m[m
 	return num;[m
 }[m
\ No newline at end of file[m
