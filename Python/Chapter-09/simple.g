expr: expr "+" product
    | product

product: product "*" factor
       | factor

factor: "(" expr ")"
      | NUMBER
