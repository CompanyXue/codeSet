#include <stdio.h>

int main() {
	char a[10001];
	scanf("%s", a);
	
	int g = 0, p = 0, l = 0, t = 0;
	
	char* ap = a;
	while (*ap != '\0') {
		if (*ap == 'g' || *ap == 'G') {
			g++;
		} else if (*ap == 'p' || *ap == 'P') {
			p++;
		} else if (*ap == 'l' || *ap == 'L') {
			l++;
		} else if (*ap == 't' || *ap == 'T') {
			t++;
		} else {

		}
		
		ap++;
	}
	
	int total_char = g + p + l + t;
	
	int i;
	for (i = 0; i < total_char; i++) {
		if (g-- > 0) {
			printf("%c", 'G');
		}

		if (p-- > 0) {
			printf("%c", 'P');
		}

		if (l-- > 0) {
			printf("%c", 'L');
		}

		if (t-- > 0) {
			printf("%c", 'T');
		}
	}
}
