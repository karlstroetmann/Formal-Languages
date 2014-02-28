in    R0
const R1,  0
const R2,  1
const R3,  1   
const R4, 41     
const R6, 45     
iflt  R6, R0, R2  
add   R1, R1, R2   
add   R2, R2, R3   
goto  R4
const R9, 48       
add   R1, R1, R9		
out   R1          
halt
data 0, 0, 0, 0
data 0, 0, 0, 3
 