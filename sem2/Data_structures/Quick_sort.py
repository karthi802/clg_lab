def partition(arr, low, high):
    pi = arr[high]
    i = low-1

    for j in range(low, high):
        if(arr[j] <= pi):
            i += 1
            arr[i], arr[j] = arr[j], arr[i]

    arr[i+1], arr[high] = arr[high], arr[i+1]
    return i+1


def Quicksort(arr, low, high):
    if(low < high):
        pi = partition(arr, low, high)
        Quicksort(arr, low, pi-1)
        Quicksort(arr, pi+1, high)


arr = [7, -2, 4, 1, 6, 5, 0, -4, 2]
n = len(arr)
Quicksort(arr, 0, n-1)
for i in range(n):
    print(arr[i], end=" ")
