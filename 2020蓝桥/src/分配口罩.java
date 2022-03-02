public class 分配口罩 {
    public static void main(String[] args) {
        int min = Integer.MAX_VALUE;
        long[] num = {9090400,8499400,5926800,8547000,4958200,4422600,
                5751200,4175600,6309600,5865200,6604400,4635000,10663400,
                8087200,4554000};

        for (int i1 = 0; i1 <= 1; i1 ++ ){
            for (int i2 = 0; i2 <= 1; i2 ++ ){
                for (int i3 = 0; i3 <= 1; i3 ++ ){
                    for (int i4 = 0; i4 <= 1; i4 ++ ){
                        for (int i5 = 0; i5 <= 1; i5 ++ ){
                            for (int i6 = 0; i6 <= 1; i6 ++ ){
                                for (int i7 = 0; i7 <= 1; i7 ++ ){
                                    for (int i8 = 0; i8 <= 1; i8 ++ ){
                                        for (int i9 = 0; i9 <= 1; i9 ++ ){
                                            for (int i10 = 0; i10 <= 1; i10 ++ ){
                                                for (int i11 = 0; i11 <= 1; i11 ++ ){
                                                    for (int i12 = 0; i12 <= 1; i12 ++ ){
                                                        for (int i13 = 0; i13 <= 1; i13 ++ ){
                                                            for (int i14 = 0; i14 <= 1; i14 ++ ) {
                                                                for (int i15 = 0; i15 <= 1; i15++) {
                                                                    long A = 0;
                                                                    long B = 0;
                                                                    if (i1 == 0) {
                                                                        A = A + num[0];
                                                                    } else if (i1 == 1) {
                                                                        B = B + num[0];
                                                                    }
                                                                    if (i2 == 0) {
                                                                        A = A + num[1];
                                                                    } else if (i2 == 1) {
                                                                        B = B + num[1];
                                                                    }
                                                                    if (i3 == 0) {
                                                                        A = A + num[2];
                                                                    } else if (i3 == 1) {
                                                                        B = B + num[2];
                                                                    }
                                                                    if (i4 == 0) {
                                                                        A = A + num[3];
                                                                    } else if (i4 == 1) {
                                                                        B = B + num[3];
                                                                    }
                                                                    if (i5 == 0) {
                                                                        A = A + num[4];
                                                                    } else if (i5 == 1) {
                                                                        B = B + num[4];
                                                                    }
                                                                    if (i6 == 0) {
                                                                        A = A + num[5];
                                                                    } else if (i6 == 1) {
                                                                        B = B + num[5];
                                                                    }
                                                                    if (i7 == 0) {
                                                                        A = A + num[6];
                                                                    } else if (i7 == 1) {
                                                                        B = B + num[6];
                                                                    }
                                                                    if (i8 == 0) {
                                                                        A = A + num[7];
                                                                    } else if (i8 == 1) {
                                                                        B = B + num[7];
                                                                    }
                                                                    if (i9 == 0) {
                                                                        A = A + num[8];
                                                                    } else if (i9 == 1) {
                                                                        B = B + num[8];
                                                                    }
                                                                    if (i10 == 0) {
                                                                        A = A + num[9];
                                                                    } else if (i10 == 1) {
                                                                        B = B + num[9];
                                                                    }
                                                                    if (i11 == 0) {
                                                                        A = A + num[10];
                                                                    } else if (i11 == 1) {
                                                                        B = B + num[10];
                                                                    }
                                                                    if (i12 == 0) {
                                                                        A = A + num[11];
                                                                    } else if (i12 == 1) {
                                                                        B = B + num[11];
                                                                    }
                                                                    if (i13 == 0) {
                                                                        A = A + num[12];
                                                                    } else if (i13 == 1) {
                                                                        B = B + num[12];
                                                                    }
                                                                    if (i14 == 0) {
                                                                        A = A + num[13];
                                                                    } else if (i14 == 1) {
                                                                        B = B + num[13];
                                                                    }
                                                                    if (i15 == 0) {
                                                                        A = A + num[14];
                                                                    } else if (i15 == 1) {
                                                                        B = B + num[14];
                                                                    }
                                                                    if (Math.abs(A - B) < min) {
                                                                        min = (int) Math.abs(A - B);
                                                                    }
                                                                }
                                                            }}}}}}}}}}}}}
        }
        System.out.println(min);
    }
}
