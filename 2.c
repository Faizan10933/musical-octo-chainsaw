// Online C compiler to run C program online
#include <stdio.h>
#include <string.h>
int main() {
    char str1[12];
    char str2[12];
    char str[]="HelloWorld";
    int l=strlen(str);
    for(int i=0;i<l;i++){
        str2[i]=str[i]&127;
        printf("%c",str2[i]);
        // printf("\n");
    }
    printf("\n");
    for(int j=0;j<l;j++){
        str1[j]=str[j]^127;
        printf("%c",str1[j]);
    }
    // printf("\n");
}
