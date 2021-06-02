def insertionSort(arr):
    for i in range(len(arr)):
        key = arr[i]
        j = i
        while j > 0 and arr[j-1] > key:
            arr[j] = arr[j-1]
            j = j-1
        arr[j] = key


arr = [int(x) for x in input().split()]
insertionSort(arr)
print(arr)
