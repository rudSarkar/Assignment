#include <stdio.h>

/*
 *Assignment:
 *Write a simple C program using "Structure" which will find the average of student marks. Marks will be given by user from keyboard.
 */

struct student
{
	int entry;
	int subject;
	float marks[100];
}
Entry, Subject, s[10];

int main()
{

	float avg;

	printf("How many student entry: ");
	scanf("%d", &Entry.entry);

	printf("How many subjects for each student: ");
	scanf("%d", &Subject.subject);

	for (int i = 1; i <= Entry.entry; ++i)
	{
		for (int u = 1; u <= Subject.subject; ++u)
		{
			switch (u)
			{
				case 1:
					printf("Student %d on Math: ", i);
					scanf("%f", &s[i].marks[u]);
					break;

				case 2:
					printf("Student %d on Physic: ", i);
					scanf("%f", &s[i].marks[u]);
					break;

				case 3:
					printf("Student %d on English: ", i);
					scanf("%f", &s[i].marks[u]);
					break;
			}

			avg += s[i].marks[u];
		}

		printf("Average marks for %d student is: %.2f\n\n", i, avg / Subject.subject);
		avg = 0;
	}

	return 0;
}
