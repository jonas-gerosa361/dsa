const array = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

const binarySearch = ((arr, target) => {
  console.log(arr, target);
  const medium = Math.round(arr.length / 2);
  const index = medium - 1;
  if (arr[index] === target) {
    console.log(`Find item ${target}`);
    return;
  }

  if (arr[index] > target) {
    const nArray = arr.splice(0, medium);
    binarySearch(nArray, target);
    return;
  }

  if (arr[index] < target) {
    const nArray = arr.splice(medium, arr.length);
    binarySearch(nArray, target);
  }
})

// binarySearch(array, 6);


const linearSearch = ((arr, target) => {
  for (let i = 0; i < arr.length; i++) {
    if (arr[i] === target) {
      console.log(`Find item ${target}, at index ${i}`);
      return;
    }

  }
  console.log('Not found');
})

linearSearch(array, 6);
