#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <stdlib.h>

void main() {
    int size = 0;
    scanf("%d", &size);
    int* arr = (int*)malloc(size * sizeof(int));

    for (int i = 0; i < size; i++) {
        scanf("%d", &arr[i]);
    }

    int* answer = (int*)malloc(size * sizeof(int));
    answer[0] = arr[0];
    int count = 1;
    for (int i = 1; i < size; i++) {
        if (arr[i] != arr[i - 1]) {
            answer[count] = arr[i];
            count++;
        }
    }

    for (int i = 0; i < count; i++) {
        printf("%d ", answer[i]);
    }
}
