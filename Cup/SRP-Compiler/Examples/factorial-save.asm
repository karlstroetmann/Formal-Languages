proc  factorial
      const  R31, 1
      add    R31, R30, R31
      store  R1, R31         // save R1
      const  R31, 2
      add    R31, R30, R31
      store  R2, R31         // save R2
      const  R31, 3
      add    R31, R30, R31
      store  R3, R31         // save R3
      const  R31, 4
      add    R31, R30, R31
      store  R4, R31         // save R4
      const  R31, -1
      add    R31, R30, R31
      load   R3, R31         // R3 = n
      const  R1, 0
      ifeq   l2, R3, R1      // (n == 0)?
      const  R2, 0           // R2 = (n == 0)
      goto   l3
label l2
      const  R2, 1           // R2 = (n == 0)
label l3
      ifeq   l1, R2, R0      // if (n != 0) goto l1	; 
      const  R1, 1
      const  R31, 1
      add    R31, R30, R31
      store  R1, R31         // Ergebnis auf Stack
      const  R31, 1
      add    R31, R30, R31
      load   R1, R31         // R1 wiederherstellen
      const  R31, 2
      add    R31, R30, R31
      load   R2, R31         // R2 wiederherstellen
      const  R31, 3
      add    R31, R30, R31
      load   R3, R31         // R3 wiederherstellen
      const  R31, 4
      add    R31, R30, R31
      load   R4, R31         // R4 wiederherstellen
      return
label l1
      const  R1, 1
      sub    R2, R3, R1      // R2 = n - 1
      const  R31, 5
      add    R31, R30, R31
      store  R2, R31         // Argument auf Stack
      const  R31, 5
      add    R30, R30, R31   // SP = SP + 5
      call   factorial
      const  R31, 1
      add    R31, R30, R31
      load   R1, R31         // R1 = factorial(n-1)
      const  R31, -6         
      add    R30, R30, R31   // SP zurück auf RA
      add    R4, R1, R0      // R4 = factorial(n-1)
      mul    R2, R3, R4      // R2 = n * factorial(n-1)
      const  R31, 1
      add    R31, R30, R31
      store  R2, R31         // Rückgabewert auf Stack legen
      const  R31, 1
      add    R31, R30, R31
      load   R1, R31         // R1 wiederherstellen
      const  R31, 2
      add    R31, R30, R31
      load   R2, R31         // R2 wiederherstellen
      const  R31, 3
      add    R31, R30, R31
      load   R3, R31         // R3 wiederherstellen
      const  R31, 4
      add    R31, R30, R31
      load   R4, R31         // R4 wiederherstellen
      return

