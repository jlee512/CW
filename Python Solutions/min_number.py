def main():
    input_test = [1, 2, 3, 4, 5, 6, 7, 68, 69, 70, 15, 17]
    input_test2 = [34, -345, -1, 100]
    print(findSmallestInt(input_test))
    print(findSmallestInt(input_test2))


def findSmallestInt(arr):
    return min(arr)

if __name__ == "__main__":
    main()