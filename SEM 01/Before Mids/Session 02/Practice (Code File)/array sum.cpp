#include<stdio.h>
#include<conio.h>

int marks(){
		int marks[5]={10,8,15,12,14};
		int sum = 0;
		int i = 0;
	
		for(i = 0; i<5; i++){
			sum = sum + marks[i];
		}
		printf("Total marks are: %d", sum);
	}
	
int main(){
marks();

}
