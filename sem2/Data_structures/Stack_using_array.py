def createStack():
    stack = []
    return stack


def isEmpty(stack):
    return len(stack) == 0


def push(stack, item):
    stack.append(item)
    print(item, "pushed to stack")


def pop(stack):
    if (isEmpty(stack)):
        print("Stack is empty")
    return stack.pop()


def peek(stack):
    if (isEmpty(stack)):
        print("Stack is empty")
    return stack[len(stack)-1]


print('IMPLEMENTATION OF STACK USING ARRAYS')
stack = createStack()
push(stack, 10)
push(stack, 20)
push(stack, 30)
print(pop(stack), "popped from stack")
print("Top Element is", peek(stack))
