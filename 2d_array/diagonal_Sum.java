//top left -> right bottom = leftappraoch+=arr[i][i]
//top right -> left bottom = rigthapproach+=arr[i][n-1-i]
//if n is odd middle element is counted twice sub it also
//these two way thats it very easy ntg imp =very very easy 



for (int i = 0; i < n; i++) {
      sumPrimary += matrix[i][i];           // Primary diagonal
      sumSecondary += matrix[i][n - 1 - i]; // Secondary diagonal
}
//now sub if n is odd 
if (n % 2 != 0) {
  total -= matrix[n/2][n/2];
}
