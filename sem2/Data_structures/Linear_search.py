arr = [int(x) for x in input().split()]
req = int(input())
n = len(arr)


def LinearSearch():
    for i in range(n):
        if(req == arr[i]):
            return i+1
    return 0

b = LinearSearch()
if(b!=0):
    print(b)
else:
    print("The element is not found")