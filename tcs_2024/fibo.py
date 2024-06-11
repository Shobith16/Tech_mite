def get_sum(N):
    if N == 1:
        return 0
    if N == 1:
        return 1
    term1 = 0
    term2 = 1
    sum = 0 
    for i in range(N-1):
        temp = term1+term2
        term1 = term2
        term2 = temp
        sum = sum + term1
    return sum
    
N = int(input("please Enter a number"))
sum = 0
sum = get_sum(N)
print(int(sum))