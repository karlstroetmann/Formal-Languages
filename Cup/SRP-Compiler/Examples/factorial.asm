proc  factorial
      const  R31, 1
      add    R31, R30, R31
      store  R1, R31
      const  R31, 2
      add    R31, R30, R31
      store  R2, R31
      const  R31, 3
      add    R31, R30, R31
      store  R3, R31
      const  R31, 4
      add    R31, R30, R31
      store  R4, R31
      const  R31, -1
      add    R31, R30, R31
      load   R3, R31
      const  R1, 0
      ifeq   l2, R3, R1
      const  R2, 0
      goto   l3
label l2
      const  R2, 1
label l3
      ifeq   l1, R2, R0
      const  R1, 1
      const  R31, 1
      add    R31, R30, R31
      store  R1, R31
      const  R31, 1
      add    R31, R30, R31
      load   R1, R31
      const  R31, 2
      add    R31, R30, R31
      load   R2, R31
      const  R31, 3
      add    R31, R30, R31
      load   R3, R31
      const  R31, 4
      add    R31, R30, R31
      load   R4, R31
      return
label l1
      const  R1, 1
      sub    R2, R3, R1
      const  R31, 5
      add    R31, R30, R31
      store  R2, R31
      const  R31, 6
      add    R30, R30, R31
      call   factorial
      const  R31, 1
      add    R31, R30, R31
      load   R1, R31
      const  R31, -7
      add    R30, R30, R31
      add    R4, R1, R0
      mul    R2, R3, R4
      const  R31, 1
      add    R31, R30, R31
      store  R2, R31
      const  R31, 1
      add    R31, R30, R31
      load   R1, R31
      const  R31, 2
      add    R31, R30, R31
      load   R2, R31
      const  R31, 3
      add    R31, R30, R31
      load   R3, R31
      const  R31, 4
      add    R31, R30, R31
      load   R4, R31
      return

