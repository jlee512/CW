import math

def main():
    input1_namelist = ["Sheldon", "Leonard", "Penny", "Rajesh", "Howard"]
    print(whoIsNext(input1_namelist, 1))
    print(whoIsNext(input1_namelist, 2))
    print(whoIsNext(input1_namelist, 52))
    print(whoIsNext(input1_namelist, 7230702951))


def whoIsNext(names, r):
    #Initialise the name_index variable
    name_index = 0

    #Adjust the n-value to a zero based index
    r = r - 1

    #Establish the initial length of the queue
    num_people = len(names)

    multiple_of_num_people_in_queue = r // num_people

    #queue_cycle - these define a full iteration through the queue (i.e. where the number of times the maximum number of one given individual has changed)
    #default queue cycle and number of individual
    queue_cycle = 1
    max_num_of_individual = 1

    if r > 0:
        #If not the first person in the queue, calculate queue cycle and max_number of any given individual
        queue_cycle = int(math.ceil(math.log((multiple_of_num_people_in_queue / 2) + 1) / math.log(2)) + 1)

        max_num_of_individual = int(math.pow(2, (queue_cycle - 1)))

    '''
    Calculate the:
    (1) offset: the number of drinks that have been bought from the vending machine up to the start of the current cycle, and
    (2) current_cycle_n: the number of drinks that have been bought from the vending machine during the current cycle
    '''

    #Default offset
    offset = 0

    if queue_cycle > 1:
        offset = num_people * (2 * int(math.pow(2, queue_cycle - 2) - 1) + 1)

    #Default current_cycle_r is equal to r (which is true for the first iteration, i.e. there have been no previous cycles)
    current_cycle_r = r

    #Calculate the number of people within previous cycles if we are in anything other than the first cycle
    if offset > 0:
        current_cycle_r = r - offset

    #Calculate the index of the individual buying the current drink
    print("current cycle {}".format(queue_cycle))
    print("current cycle r: {}".format(current_cycle_r))

    name_index = current_cycle_r // max_num_of_individual

    return names[name_index]


if __name__ == "__main__":
    main()
