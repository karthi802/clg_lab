class node:
    def __init__(self, data):
        self.data = data
        self.next = None
        self.prev = None


class doublelinkedlist:
    def __init__(self):
        self.head = None

    def push(self, data):
        new_node = node(data)
        new_node.next = self.head
        if self.head != None:
            self.head.prev = new_node
        self.head = new_node

    def printlist(self, node):
        while node:
            last = node
            node = node.next
        print("Traversal in forward direction")
        while last:
            print(" %d" % (last.data))
            last = last.prev

    def printlist1(self, node):
        print("\nTraversal in reverse direction")
        while node:
            print(" %d" % (node.data))
            node = node.next


llist = doublelinkedlist()
llist.push(1)
llist.push(2)
llist.push(3)
llist.push(4)
llist.push(5)
llist.printlist(llist.head)
llist.printlist1(llist.head)
