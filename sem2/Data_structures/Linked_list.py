class Node:
    def __init__(self, data=None):
        self.data = data
        self.nxtadd = None


class Linkedlist:
    def __init__(self):
        self.head = None

    def listprint(self):
        printval = self.head
        while printval is not None:
            print(printval.data)
            printval = printval.nxtadd


list = Linkedlist()
list.head = Node("1")
l2 = Node("2")
l3 = Node("3")

list.head.nxtadd = l2
l2.nxtadd = l3

list.listprint()
