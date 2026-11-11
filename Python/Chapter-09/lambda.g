expr: product expr_rest

expr_rest: "+" product expr_rest
         |

product: factor product_rest

product_rest: "*" factor product_rest
            |

factor: "(" expr ")"
      | NUMBER
