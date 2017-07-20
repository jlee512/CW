def main():
    input_test = [1, 2, 3, 4, 5, 6, 7, 68, 69, 70, 15, 17]
    print(filter_lucky(input_test))


def filter_lucky(lst):

    lucky_nums = []

    for number in lst:
        if '7' in str(number):
            lucky_nums.append(number)
    return lucky_nums

if __name__ == "__main__":
    main()