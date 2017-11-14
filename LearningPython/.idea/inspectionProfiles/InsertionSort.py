List = [6, 2, 21, 3, 54, 11]


def insertionsort(alist):

    for i in range(1, len(alist)):
        temp = alist[i]
        k = i
        while k > 0 and temp < alist[k-1]:
            alist[k] = alist[k-1]
            k -= 1
        alist[k] = temp


insertionsort(List)

print(List)
