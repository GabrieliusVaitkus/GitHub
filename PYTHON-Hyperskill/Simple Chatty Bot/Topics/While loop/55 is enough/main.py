num = int(input())
lst = []
end = 55

while num != end:
    lst.append(num)
    num = int(input())

total = sum(lst)
average = sum(lst) / len(lst)

print(len(lst))
print(total)
print(round(average))
