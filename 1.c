#include <stdio.h>
#include <string.h>
int main() {
    char str1[12];
    char str[]="HelloWorld";
    int l=strlen(str);
    for(int i=0;i<l;i++){
        str1[i]=str[i]^0;
        printf("%c",str[i]);
    }
    printf("\n");
}
