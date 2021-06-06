class Node:
    def init(self, data):
        self.data = data
        self.next = None


class Queue:
    def init(self):
        self.front = self.rear = None

    def isEmpty(self):
        return self.front == None

    def EnQueue(self, item):
        temp = Node(item)
        if self.rear == None:
            self.front = self.rear = temp
            return
        self.rear.next = temp
        self.rear = temp

    def DeQueue(self):
        if self.isEmpty():
            return
        temp = self.front
        self.front = temp.next
        if(self.front == None):
            self.rear = None


q = Queue()
print("IMPLEMENTATION OF QUEUE USING LINKED LIST")
print("\n Enqueue 10, 20")
q.EnQueue(10)
q.EnQueue(20)
print("\n Dequeue Twice")
q.DeQueue()
q.DeQueue()
print("\n Enqueue30, 40, 50")
q.EnQueue(30)
q.EnQueue(40)
q.EnQueue(50)
print("\n Dequeue Once")
q.DeQueue()
print("\n Queue Front " + str(q.front.data))
print("\n Queue Rear " + str(q.rear.data))
