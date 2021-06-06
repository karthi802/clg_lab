class Queue:
    def __init__(self, c):
        self.queue = []
        self.front = self.rear = 0
        self.capacity = c

    def queueEnqueue(self, data):
        if(self.capacity == self.rear):
            print("\nQueue is full")
        else:
            self.queue.append(data)
            self.rear += 1

    def queueDequeue(self):
        if(self.front == self.rear):
            print("Queue is Empty")
        else:
            x = self.queue.pop(0)
            self.rear -= 1

    def queueDisplay(self):
        if(self.front == self.rear):
            print("\nQueue is Empty")
        for i in self.queue:
            print(i, "<--", end='')

    def queueFront(self):
        if(self.front == self.rear):
            print("\nQueue is Empty")
        print("\nFront Element is:", self.queue[self.front])


q = Queue(4)
q.queueDisplay()
print("SIZE OF THE QUEUE =  4")
print("After Insertion of 10, 20, 30, 40")
q.queueEnqueue(10)
q.queueEnqueue(20)
q.queueEnqueue(30)
q.queueEnqueue(40)

q.queueDisplay()

q.queueEnqueue(50)

q.queueDisplay()

q.queueDequeue()
q.queueDequeue()
print("\n\nafter two node deletion\n")

q.queueDisplay()
q.queueFront()
