    .file  "main.java"
__SREG__ = 0x3f
__SP_H__ = 0x3e
__SP_L__ = 0x3d
__tmp_reg__ = 0
__zero_reg__ = 1
    .global __do_copy_data
    .global __do_clear_bss
    .text
.global main
    .type   main, @function
main:
    push r29
    push r28
    in r28,__SP_L__
    in r29,__SP_H__
/* prologue: function */
    call _Z18MeggyJrSimpleSetupv 
    /* Need to call this so that the meggy library gets set up */

    #David Bennett dcb2yd

    # Load constant int 1
    ldi    r24,lo8(3)
    ldi    r25,hi8(3)
    # push two byte expression onto stack
    push   r25
    push   r24

    # Casting int to byte by popping
    # 2 bytes off stack and only pushing low order bits
    # back on.  Low order bits are on top of stack.
    pop    r24
    pop    r25
    push   r24

    call   _Z16CheckButtonsDownv
    lds    r24, Button_Up
    tst    r24
    brne   Up
    call   _Z16CheckButtonsDownv
    lds    r24, Button_Down
    tst    r24
    brne   Down
    jmp    End
Up:
    # Load constant int 7
    ldi    r24,lo8(7)
    ldi    r25,hi8(7)
    # push two byte expression onto stack
    push   r25
    push   r24
    # Casting int to byte by popping
    # 2 bytes off stack and only pushing low order bits
    # back on.  Low order bits are on top of stack.
    pop    r24
    pop    r25
    push   r24

    #load Meggy.Color.BLUE
    ldi    r22,5
    #push blue to the stack
    push   r22
    jmp    Set

Down:
    # Load constant int 0
    ldi    r24,lo8(0)
    ldi    r25,hi8(0)
    # push two byte expression onto stack
    push   r25
    push   r24
    # Casting int to byte by popping
    # 2 bytes off stack and only pushing low order bits
    # back on.  Low order bits are on top of stack.
    pop    r24
    pop    r25
    push   r24

    #load Meggy.Color.RED
    ldi    r22,1
    #push red to the stack
    push   r22

Set:
    #Meggy.setPixel(x,y,color) call, load color, y, x into r20, r22, and r24 respectively
    pop    r20
    pop    r22
    pop    r24
    call   _Z6DrawPxhhh
    call   _Z12DisplaySlatev

End:

/* epilogue start */
endLabel:
jmp endLabel
ret
.size   main, .-main
