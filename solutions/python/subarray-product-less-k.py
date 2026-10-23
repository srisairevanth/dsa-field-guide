def num_subarray_product_less_than_k(nums, k):
    if k <= 1:
        return 0
    prod = 1
    count = 0
    lo = 0
    for hi, x in enumerate(nums):
        prod *= x
        while prod >= k:
            prod //= nums[lo]
            lo += 1
        count += hi - lo + 1
    return count
