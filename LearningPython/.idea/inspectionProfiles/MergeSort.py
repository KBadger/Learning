List = [6, 2, 21, 3, 54, 11]

def mergesort(alist):
    mergesortrec(alist, 0, len(alist) -1)


def mergesortrec(blist, first, last):
    if first < last:
        sred = (first + last)/2
        mergesortrec(blist, first, sred)
        mergesortrec(blist, sred + 1, last)
        merge(blist, first, last, sred)

def merge(clist, first, last, sred):
    templist = []
    i = first
    j = sred + 1
    while i <= sred and j <= last :
        if clist[i] <= clist[j]:
            templist.append(clist[i])
            i += 1
        else:
            templist.append(clist[j])
    while i <= sred:
        templist.append(clist[i])
        i += 1
    while j <= last:
        templist.append(clist[j])
        j += 1
    for k in range(0, last - first + 1):
        clist[first + k] = templist[k]


mergesort(List)

print(List)
