#include <stdio.h>

struct Student {
    int roll;
    char name[50];
    float marks;
};

void addStudent(struct Student s[], int *n) {
    printf("\nEnter Roll Number: ");
    scanf("%d", &s[*n].roll);

    printf("Enter Name: ");
    scanf("%s", s[*n].name);

    printf("Enter Marks: ");
    scanf("%f", &s[*n].marks);

    (*n)++;
    printf("Student Added Successfully!\n");
}

void displayStudents(struct Student s[], int n) {
    int i;

    if (n == 0) {
        printf("\nNo Records Found!\n");
        return;
    }

    printf("\n----- Student Records -----\n");
    printf("Roll\tName\tMarks\n");

    for (i = 0; i < n; i++) {
        printf("%d\t%s\t%.2f\n",
               s[i].roll,
               s[i].name,
               s[i].marks);
    }
}

void searchStudent(struct Student s[], int n) {
    int roll, i, found = 0;

    printf("\nEnter Roll Number to Search: ");
    scanf("%d", &roll);

    for (i = 0; i < n; i++) {
        if (s[i].roll == roll) {
            printf("\nStudent Found!\n");
            printf("Roll: %d\n", s[i].roll);
            printf("Name: %s\n", s[i].name);
            printf("Marks: %.2f\n", s[i].marks);
            found = 1;
            break;
        }
    }

    if (!found)
        printf("Student Not Found!\n");
}

void highestMarks(struct Student s[], int n) {
    int i, index = 0;

    if (n == 0) {
        printf("\nNo Records Found!\n");
        return;
    }

    for (i = 1; i < n; i++) {
        if (s[i].marks > s[index].marks) {
            index = i;
        }
    }

    printf("\nStudent with Highest Marks\n");
    printf("Roll: %d\n", s[index].roll);
    printf("Name: %s\n", s[index].name);
    printf("Marks: %.2f\n", s[index].marks);
}

int main() {
    struct Student students[100];
    int n = 0;
    int choice;

    do {
        printf("\n===== STUDENT MANAGEMENT SYSTEM =====\n");
        printf("1. Add Student\n");
        printf("2. Display Students\n");
        printf("3. Search Student\n");
        printf("4. Highest Marks\n");
        printf("5. Exit\n");
        printf("Enter Choice: ");
        scanf("%d", &choice);

        switch (choice) {
            case 1:
                addStudent(students, &n);
                break;

            case 2:
                displayStudents(students, n);
                break;

            case 3:
                searchStudent(students, n);
                break;

            case 4:
                highestMarks(students, n);
                break;

            case 5:
                printf("Program Ended.\n");
                break;

            default:
                printf("Invalid Choice!\n");
        }

    } while (choice != 5);

    return 0;
}