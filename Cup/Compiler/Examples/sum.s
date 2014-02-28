	.text
.globl _sum
_sum:
	pushl	%ebp
	movl	%esp, %ebp
	subl	$24, %esp
	movl	$0, -12(%ebp)
	jmp	L2
L3:
	movl	8(%ebp), %eax
	addl	%eax, -12(%ebp)
	decl	8(%ebp)
L2:
	cmpl	$0, 8(%ebp)
	jne	L3
	movl	-12(%ebp), %eax
	leave
	ret
.globl _main
_main:
	pushl	%ebp
	movl	%esp, %ebp
	subl	$40, %esp
	call	_getchar
	movl	%eax, -12(%ebp)
	subl	$48, -12(%ebp)
	movl	-12(%ebp), %eax
	movl	%eax, (%esp)
	call	_sum
	addl	$48, %eax
	movl	%eax, (%esp)
	call	_putchar
	movl	$10, (%esp)
	call	_putchar
	leave
	ret
.subsections_via_symbols
