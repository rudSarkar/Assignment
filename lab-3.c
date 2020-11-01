#include <stdio.h>

char queStorage[3];
int queueIndex = 3, frontIndex = -1, rearIndex = -1;

void Enqueue(char temp) {
    if (rearIndex == queueIndex - 1) printf("Overflow\n");
    else {
        if (frontIndex == -1) frontIndex = 0;
        queStorage[++rearIndex] = temp;
    }
}
void Dequeue() {
    if (frontIndex == -1) printf("Underflow\n");
    else {
        if (frontIndex == rearIndex + 1) {
            frontIndex = -1;
            rearIndex = -1;
        } else printf("%c\n", queStorage[frontIndex++]);
    }
}
void printQueue() {
    for (int i = 0; i < queueIndex; i++) {
        printf("%c\n", queStorage[i]);
    }
}
int main() {
    Enqueue('A');
    Enqueue('B');
    Enqueue('C');
    Dequeue();
    Dequeue();
    Enqueue('D');
    Enqueue('E');
    Enqueue('F');
    Dequeue();
    Enqueue('G');
    Enqueue('H');
    Dequeue();
    printQueue();
    return 0;
}
