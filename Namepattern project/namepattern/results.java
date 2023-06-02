package namepattern;

public class results extends input {
    void result() {
        char key;
        System.out.println("***************************");
        System.out.println("--- The pattern started ---");
        System.out.println("***************************");
        for (int k1 = 0; k1 < ch.length; k1++) {
            ch[k1] = name.charAt(k1);
            key = ch[k1];
            switch (key) {
                case a:
                    for (int i = 1; i <= 5; i++) {
                        for (int j = 1; j <= 5; j++) {
                            if (i == 1 && j == 1 || i == 1 && j == 5 || i == 2 && j == 2 || i == 2 && j == 3
                                    || i == 2 && j == 4 || i == 4 && j == 2 || i == 4 && j == 3 || i == 4 && j == 4
                                    || i == 5 && j == 2 || i == 5 && j == 3 || i == 5 && j == 4) {
                                System.out.print(" ");
                            } else {
                                try {
                                    Thread.sleep(100);
                                } catch (Exception e) {
                                    System.out.println("error");
                                }
                                System.out.print("*");
                            }
                            System.out.print(" ");
                        }
                        System.out.println();
                    }
                    System.out.println();
                    break;

                case b:
                    for (int i = 1; i <= 5; i++) {
                        for (int j = 1; j <= 5; j++) {
                            if (i == 1 && j == 5 || i == 2 && j == 2 || i == 2 && j == 3 || i == 2 && j == 4
                                    || i == 5 && j == 5 || i == 3 && j == 5 || i == 4 && j == 2 || i == 4 && j == 3
                                    || i == 4 && j == 4) {
                                System.out.print(" ");
                            } else {
                                try {
                                    Thread.sleep(100);
                                } catch (Exception e) {
                                    System.out.println("error");
                                }
                                System.out.print("*");
                            }
                            System.out.print(" ");
                        }
                        System.out.println();
                    }
                    System.out.println();
                    break;

                case c:
                    for (int i = 1; i <= 5; i++) {
                        for (int j = 1; j <= 5; j++) {
                            if (i == 1 && (j > 1 && j != 5) || i == 2 && (j == 1) || i == 3 && j == 1
                                    || i == 4 && (j == 1) || i == 5 && (j > 1 && j != 5)) {
                                try {
                                    Thread.sleep(100);
                                } catch (Exception e) {
                                    System.out.println("error");
                                }
                                System.out.print("*");
                            } else {
                                System.out.print(" ");
                            }
                            System.out.print(" ");
                        }
                        System.out.println();
                    }
                    System.out.println();
                    break;

                case d:
                    for (int i = 1; i <= 5; i++) {
                        for (int j = 1; j <= 5; j++) {
                            if (i == 1 && (j != 5) || i == 2 && (j == 1 || j == 5) || i == 3 && (j == 1 || j == 5)
                                    || i == 4 && (j == 1 || j == 5) || i == 5 && (j != 5)) {
                                try {
                                    Thread.sleep(100);
                                } catch (Exception e) {
                                    System.out.println("error");
                                }
                                System.out.print("*");
                            } else {
                                System.out.print(" ");
                            }
                            System.out.print(" ");
                        }
                        System.out.println();
                    }
                    System.out.println();
                    break;

                case e:
                    for (int i = 1; i <= 5; i++) {
                        for (int j = 1; j <= 5; j++) {
                            if ((i == 1 && j <= 5) || (i == 3 && j <= 5) || (i == 5 & j <= 5) || (i <= 5 && j == 1)) {
                                try {
                                    Thread.sleep(100);
                                } catch (Exception e) {
                                    System.out.println("error");
                                }
                                System.out.print("*");
                            } else {
                                System.out.print(" ");
                            }
                            System.out.print(" ");
                        }
                        System.out.println();
                    }
                    System.out.println();
                    break;

                case f:
                    for (int i = 1; i <= 5; i++) {
                        for (int j = 1; j <= 5; j++) {
                            if ((i == 1 && j <= 5) || (i == 3 && j <= 5) || (i <= 5 && j == 1)) {
                                try {
                                    Thread.sleep(100);
                                } catch (Exception e) {
                                    System.out.println("error");
                                }
                                System.out.print("*");
                            } else {
                                System.out.print(" ");
                            }
                            System.out.print(" ");
                        }
                        System.out.println();
                    }
                    System.out.println();
                    break;

                case g:
                    for (int i = 1; i <= 5; i++) {
                        for (int j = 1; j <= 5; j++) {
                            if ((i == 1 && j <= 5) || (i == 3 && (j <= 5 && j > 2)) || (i == 5 & j <= 5)
                                    || (i <= 5 && j == 1) || (i == 4 && j == 5)) {
                                try {
                                    Thread.sleep(100);
                                } catch (Exception e) {
                                    System.out.println("error");
                                }
                                System.out.print("*");
                            } else {
                                System.out.print(" ");
                            }
                            System.out.print(" ");
                        }
                        System.out.println();
                    }
                    System.out.println();
                    break;

                case h:
                    for (int i = 1; i <= 5; i++) {
                        for (int j = 1; j <= 5; j++) {
                            if ((i >= 1 && j == 1) || (i >= 1 && j == 5) || (i == 3 && j <= 5)) {
                                try {
                                    Thread.sleep(100);
                                } catch (Exception e) {
                                    System.out.println("error");
                                }
                                System.out.print("*");
                            } else {
                                System.out.print(" ");
                            }
                            System.out.print(" ");
                        }
                        System.out.println();
                    }
                    System.out.println();
                    break;

                case i:
                    for (int i = 1; i <= 5; i++) {
                        for (int j = 1; j <= 5; j++) {
                            if ((i == 1 && j >= 1) || (i == 5 && j >= 1) || (i >= 1 && j == 3)) {
                                try {
                                    Thread.sleep(100);
                                } catch (Exception e) {
                                    System.out.println("error");
                                }
                                System.out.print("*");
                            } else {
                                System.out.print(" ");
                            }
                            System.out.print(" ");
                        }
                        System.out.println();
                    }
                    System.out.println();
                    break;

                case j:
                    for (int i = 1; i <= 5; i++) {
                        for (int j = 1; j <= 5; j++) {
                            if ((i == 1 && j >= 1) || (i == 5 && (j >= 1 && j <= 2)) || ((i >= 1 && i < 5) && j == 3)) {
                                try {
                                    Thread.sleep(100);
                                } catch (Exception e) {
                                    System.out.println("error");
                                }
                                System.out.print("*");
                            } else {
                                System.out.print(" ");
                            }
                            System.out.print(" ");
                        }
                        System.out.println();
                    }
                    System.out.println();
                    break;

                case k:
                    for (int i = 1; i <= 5; i++) {
                        for (int j = 1; j <= 5; j++) {
                            if ((j == 2 && i >= 1) || (i == 1 && j == 5) || (i == 2 && j == 4) || (i == 3 && j == 3)
                                    || (i == 4 && j == 4) || (i == 5 && j == 5)) {
                                try {
                                    Thread.sleep(100);
                                } catch (Exception e) {
                                    System.out.println("error");
                                }
                                System.out.print("*");
                            } else {
                                System.out.print(" ");
                            }
                            System.out.print(" ");
                        }
                        System.out.println();
                    }
                    System.out.println();
                    break;

                case l:
                    for (int i = 1; i <= 5; i++) {
                        for (int j = 1; j <= 5; j++) {
                            if ((i == 5 && j >= 1) || (j == 1 && i >= 1)) {
                                try {
                                    Thread.sleep(100);
                                } catch (Exception e) {
                                    System.out.println("error");
                                }
                                System.out.print("*");
                            } else {
                                System.out.print(" ");
                            }
                            System.out.print(" ");
                        }
                        System.out.println();
                    }
                    System.out.println();
                    break;

                case m:
                    for (int i = 1; i <= 5; i++) {
                        for (int j = 1; j <= 5; j++) {
                            if ((i >= 1 && j == 1) || (i >= 1 && j == 5) || (i == 2 && j % 2 == 0)
                                    || (i == 3 && (j % 2 != 0))) {
                                try {
                                    Thread.sleep(100);
                                } catch (Exception e) {
                                    System.out.println("error");
                                }
                                System.out.print("*");
                            } else {
                                System.out.print(" ");
                            }
                            System.out.print(" ");
                        }
                        System.out.println();
                    }
                    System.out.println();
                    break;

                case n:
                    for (int i = 1; i <= 5; i++) {
                        for (int j = 1; j <= 5; j++) {
                            if ((i >= 1 && j == 1) || (i >= 1 && j == 5) || (i == j)) {
                                try {
                                    Thread.sleep(100);
                                } catch (Exception e) {
                                    System.out.println("error");
                                }
                                System.out.print("*");
                            } else {
                                System.out.print(" ");
                            }
                            System.out.print(" ");
                        }
                        System.out.println();
                    }
                    System.out.println();
                    break;

                case o:
                    for (int i = 1; i <= 5; i++) {
                        for (int j = 1; j <= 5; j++) {
                            if ((i == 1 && (j <= 4 && j > 1)) || (i == 5 && (j <= 4 && j > 1))
                                    || (j == 1 && (i > 1 && i < 5)) || (j == 5 && (i > 1 && i < 5))) {
                                try {
                                    Thread.sleep(100);
                                } catch (Exception e) {
                                    System.out.println("error");
                                }
                                System.out.print("*");
                            } else {
                                System.out.print(" ");
                            }
                            System.out.print(" ");
                        }
                        System.out.println();
                    }
                    System.out.println();
                    break;

                case p:
                    for (int i = 1; i <= 5; i++) {
                        for (int j = 1; j <= 5; j++) {
                            if (i == 1 && j == 5 || i == 2 && j == 2 || i == 2 && j == 3 || i == 2 && j == 4
                                    || i == 5 && j == 5 || i == 3 && j == 5 || i == 4 && j == 2 || i == 4 && j == 3
                                    || i == 4 && j == 4 || i == 4 && j > 1 || i == 5 && j > 1) {
                                System.out.print(" ");
                            } else {
                                try {
                                    Thread.sleep(100);
                                } catch (Exception e) {
                                    System.out.println("error");
                                }
                                System.out.print("*");
                            }
                            System.out.print(" ");
                        }
                        System.out.println();
                    }
                    System.out.println();
                    break;

                case q:
                    for (int i = 1; i <= 5; i++) {
                        for (int j = 1; j <= 5; j++) {
                            if ((i == 1 && (j < 4 && j > 1)) || (i == 5 && (j < 4 && j > 1))
                                    || (j == 1 && (i > 1 && i < 5)) || (j == 4 && (i > 1 && i < 5))
                                    || (i == 4 && (j == 3)) || (i == 5 && (j == 4 || j == 5))) {
                                try {
                                    Thread.sleep(100);
                                } catch (Exception e) {
                                    System.out.println("error");
                                }
                                System.out.print("*");
                            } else {
                                System.out.print(" ");
                            }
                            System.out.print(" ");
                        }
                        System.out.println();
                    }
                    System.out.println();
                    break;

                case r:
                    for (int i = 1; i <= 5; i++) {
                        for (int j = 1; j <= 5; j++) {
                            if (i == 1 && j == 5 || i == 2 && j == 2 || i == 2 && j == 3 || i == 2 && j == 4
                                    || i == 5 && j == 5 || i == 3 && j == 5 || i == 4 && j == 4
                                    || i == 4 && (j == 2 || j > 3) || i == 5 && (j != 4 && j != 1)) {
                                System.out.print(" ");
                            } else {
                                try {
                                    Thread.sleep(100);
                                } catch (Exception e) {
                                    System.out.println("error");
                                }
                                System.out.print("*");
                            }
                            System.out.print(" ");
                        }
                        System.out.println();
                    }
                    System.out.println();
                    break;

                case s:
                    for (int i = 1; i <= 5; i++) {
                        for (int j = 1; j <= 5; j++) {
                            if ((i == 1 && (j <= 5)) || (i == 3 && j <= 5) || (i == 5 & j <= 5) || ((i <= 3) && j == 1)
                                    || (j == 5 && i == 4)) {
                                try {
                                    Thread.sleep(100);
                                } catch (Exception e) {
                                    System.out.println("error");
                                }
                                System.out.print("*");
                            } else {
                                System.out.print(" ");
                            }
                            System.out.print(" ");
                        }
                        System.out.println();
                    }
                    System.out.println();
                    break;

                case t:
                    for (int i = 1; i <= 5; i++) {
                        for (int j = 1; j <= 5; j++) {
                            if ((i == 1 && j >= 1) || (i >= 1 && j == 3)) {
                                try {
                                    Thread.sleep(100);
                                } catch (Exception e) {
                                    System.out.println("error");
                                }
                                System.out.print("*");
                            } else {
                                System.out.print(" ");
                            }
                            System.out.print(" ");
                        }
                        System.out.println();
                    }
                    System.out.println();
                    break;

                case u:
                    for (int i = 1; i <= 5; i++) {
                        for (int j = 1; j <= 5; j++) {
                            if ((i < 5 && j == 1) || (i < 5 && j == 5) || (i == 5 && (j > 1 && j < 5))) {
                                try {
                                    Thread.sleep(100);
                                } catch (Exception e) {
                                    System.out.println("error");
                                }
                                System.out.print("*");
                            } else {
                                System.out.print(" ");
                            }
                            System.out.print(" ");
                        }
                        System.out.println();
                    }
                    System.out.println();
                    break;

                case v:
                    for (int i = 1; i <= 5; i++) {
                        for (int j = 1; j <= 10; j++) {
                            if ((i == j && j <= 5) || (i < 5 && (j == (10 - i) && (j < 10 && j > 5)))) {
                                try {
                                    Thread.sleep(100);
                                } catch (Exception e) {
                                    System.out.println("error");
                                }
                                System.out.print("*");
                            } else {
                                System.out.print(" ");
                            }

                        }
                        System.out.println();
                    }
                    System.out.println();
                    break;

                case w:
                    for (int i = 1; i <= 5; i++) {
                        for (int j = 1; j <= 5; j++) {
                            if ((i >= 1 && j == 1) || (i >= 1 && j == 5) || (i == 4 && j % 2 == 0)
                                    || (i == 3 && (j % 2 != 0))) {
                                try {
                                    Thread.sleep(100);
                                } catch (Exception e) {
                                    System.out.println("error");
                                }
                                System.out.print("*");
                            } else {
                                System.out.print(" ");
                            }
                            System.out.print(" ");
                        }
                        System.out.println();
                    }
                    System.out.println();
                    break;

                case x:
                    for (int i = 1; i <= 5; i++) {
                        for (int j = 1; j <= 5; j++) {
                            if ((i == j) || (i >= 1 && (j == 6 - i))) {
                                try {
                                    Thread.sleep(100);
                                } catch (Exception e) {
                                    System.out.println("error");
                                }
                                System.out.print("*");
                            } else {
                                System.out.print(" ");
                            }
                            System.out.print(" ");
                        }
                        System.out.println();
                    }
                    System.out.println();
                    break;

                case y:
                    for (int i = 1; i <= 5; i++) {
                        for (int j = 1; j <= 5; j++) {
                            if ((i == j && (j <= 3)) || (i >= 1 && (j == 6 - i && (j >= i))) || (i >= 3 && (j == 3))) {
                                try {
                                    Thread.sleep(100);
                                } catch (Exception e) {
                                    System.out.println("error");
                                }
                                System.out.print("*");
                            } else {
                                System.out.print(" ");
                            }
                            System.out.print(" ");
                        }
                        System.out.println();
                    }
                    System.out.println();
                    break;

                case z:
                    for (int i = 1; i <= 5; i++) {
                        for (int j = 1; j <= 5; j++) {
                            if ((i == 1 && j <= 5) || (i == 5 && j <= 5) || (i <= 5 && (j == 6 - i))) {
                                try {
                                    Thread.sleep(100);
                                } catch (Exception e) {
                                    System.out.println("error");
                                }
                                System.out.print("*");
                            } else {
                                System.out.print(" ");
                            }
                            System.out.print(" ");
                        }
                        System.out.println();
                    }
                    System.out.println();
                    break;

                default:

                    System.out.println("\n" + key + " Not Found Please Update");
                    break;
            }
        }
        System.out.println("***************************");
        System.out.println("---      Thank You      ---");
        System.out.println("***************************");
    }

}