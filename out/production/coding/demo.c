#include <stdio.h>
int main () {

    int arr[5], i;
    printf("enter thr 5 element of array");
    for(i=0; i<5; i++){
        scanf("%d", &arr[i]);
    }
    for(i=0; i<5; i++){
        printf("%d", arr[i]);
    }
    return 0;
}


