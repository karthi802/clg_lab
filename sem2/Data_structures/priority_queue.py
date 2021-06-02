class PriorityQueue(object):

    def init(self):
        self.queue = []

    def str(self):
        return ' '.join([str(i) for i in self.queue])

    def isEmpty(self):
        return len(self.queue) == 0

    def insert(self, data):
        self.queue.append(data)

    def delete(self):
        try:
            max = 0
            for i in range(len(self.queue)):
                if self.queue[i] > self.queue[max]:
                    max = i
            item = self.queue[max]
            del self.queue[max]
            return item

        except IndexError:
            print()
            exit()


myQueue = PriorityQueue()
myQueue.insert(12)
myQueue.insert(1)
myQueue.insert(14)
myQueue.insert(7)
print(myQueue)
while not myQueue.isEmpty():
    print(myQueue.delete())
