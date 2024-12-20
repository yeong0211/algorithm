#include <stdio.h>
#include <stdlib.h>

int main() {
	int num1, num2, a, b;
	scanf("%d %d", &num1, &num2);

	if (num1 < num2) {
		a = num2, b = num1;
	}
	else {
		b = num2, a = num1;
	}

	while (b > 0) {
		int temp = a % b;
		a = b;
		b = temp;
	}

	printf("%d\n%d", a, (num1 * num2 / a));
    return 0;
}