function Create2DArray(rows,columns) {
   let x = new Array(rows);
   for (let i = 0; i < rows; i++) {
       x[i] = new Array(columns);
   }
   return x;
}
/**
 * @param {number} m
 * @param {number} n
 * @return {number}
 */
var uniquePaths = function(m, n) {
    let matrix = Create2DArray(m,n);
    for(let i = 0; i < m; i++)
        matrix[i][0] = 1;
    for(let i = 0; i < n; i++)
        matrix[0][i] = 1;
    for(let i = 1; i < m ; i++) {
        for(let j = 1; j < n; j++) {
            matrix[i][j] = matrix[i-1][j] + matrix[i][j-1];
        }
    }
    return matrix[m-1][n-1];
};
