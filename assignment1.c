#include<stdio.h>

int main() {

  int r, u, d, a;
  double mat[100], phy[100], eng[100], sum[100], avg[100];

  printf("How many students entry: ");
  scanf("%d", & d);

  printf("How many subject for each students: ");
  scanf("%d", & a);

  for (r = 1; r <= d; r++) {
    for (u = 1; u <= a; u++) {
      switch (u) {
      case 1:
        printf("Student %d on Math: ", r);
        scanf("%lf", & mat[r]);
        break;
      case 2:
        printf("Student %d on Physic: ", r);
        scanf("%lf", & phy[r]);
        break;
      case 3:
        printf("Student %d on English: ", r);
        scanf("%lf", & eng[r]);
        break;
      }
    }
  }

  for (r = 1; r <= d; r++) {
    sum[r] = mat[r] + phy[r] + eng[r];
    avg[r] = sum[r] / a;
    printf("Average marks for student %d is: %lf\n", r, avg[r]);
  }

}
