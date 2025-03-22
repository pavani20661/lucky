def main():
    # Read the number of test cases
    N = int(input())
    
    results = []
    
    # Process each test case
    for _ in range(N):
        # Read X (number of integers)
        X = int(input())
        # Read the list of X space-separated integers
        numbers = list(map(int, input().split()))
        
        # Calculate the sum of squares of non-negative integers
        sum_of_squares = sum(y**2 for y in numbers if y >= 0)
        
        # Store the result to output later
        results.append(str(sum_of_squares))
    
    # Output all the results for the test cases, each on a new line
    print("\n".join(results))

# Call the main function to run the program
main()

