def Mergesort(arr):
    if len(arr) > 1:
        m = len(arr)//2
        L = arr[:m]
        R = arr[m:]
        Mergesort(L)
        Mergesort(R)
        i = j = k = 0
        while i < len(L) and j < len(R):
            if L[i] < R[j]:
                arr[k] = L[i]
                i += 1
            else:
                arr[k] = R[j]
                j += 1
            k += 1

        while i < len(L):
            arr[k] = L[i]
            i += 1
            k += 1

        while j < len(L):
            arr[k] = R[j]
            j += 1
            k += 1


arr = [int(x) for x in input().split()]
print("Given array is")
for i in range(len(arr)):
    print(arr[i], end=" ")
print(" ")
Mergesort(arr)
print("Sorted array is:")
for i in range(len(arr)):
    print(arr[i], end=" ")
