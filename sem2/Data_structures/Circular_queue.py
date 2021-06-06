class Circularqueue:
    def __init__(self, size):
        self.size = size
        self.queue = [None for i in range(size)]
        self.front = self.rear = -1

    def enqueue(self, data):
        if((self.rear+1) % self.size == self.front):
            print(" Queue is full\n")
        elif(self.front == -1):
            self.front = 0
            self.rear = 0
            self.queue[self.rear] = data
        else:
            self.rear = (self.rear+1) % self.size
            self.queue[self.rear] = data

    def dequeue(self):
        if(self.front == -1):
            print(" Queue is Empty\n")
        elif(self.front == self.rear):
            temp = self.queue[self.front]
            self.front = -1
            self = -1
            return temp
        else:
            temp = self.queue[self.front]
            self.front = (self.front+1) % self.size
            return temp

    def display(self):
        if(self.front == -1):
            print(" Queue is Empty")
        elif(self.rear >= self.front):
            print("Elements in the circular queue are:", end=" ")
            for i in range(self.front, self.rear+1):
                print(self.queue[i], end=" ")
            print()
        else:
            print("Elements in the Circular Queue are:", end=" ")
            for i in range(self.front, self.size):
                print(self.queue[i], end=" ")
            for i in range(0, self.rear+1):
                print(self.queue[i], end=" ")
            print()
        if((self.rear+1) % self.size == self.front):
            print(" Queue is Full")


cq = Circularqueue(5)
cq.enqueue(14)
cq.enqueue(22)
cq.enqueue(13)
cq.enqueue(-6)
cq.display()
print("Deleted value = ", cq.dequeue())
print("Deleted value = ", cq.dequeue())
cq.display()
cq.enqueue(9)
cq.enqueue(20)
cq.enqueue(5)
cq.display()
