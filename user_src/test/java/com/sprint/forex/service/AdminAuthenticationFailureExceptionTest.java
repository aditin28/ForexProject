package com.sprint.forex.service;
import com.sprint.forex.exception.AdminAuthenticationFailureException;
import com.sprint.forex.exception.AdminEmailNotExisting;
import com.sprint.forex.exception.AdminNotFoundException;
import com.sprint.forex.exception.EmailNotExistingException;
import com.sprint.forex.exception.ExchangeRateNotFoundException;
import com.sprint.forex.exception.InvalidAccountException;
import com.sprint.forex.exception.TransactionNotFoundException;
import com.sprint.forex.exception.UserBankDetailsNotFoundException;
import com.sprint.forex.exception.UsersEmailNotExistingException;
import com.sprint.forex.exception.UsersNotFoundException;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

 class AdminAuthenticationFailureExceptionTest {

    @Test
     void testAdminAuthenticationFailureExceptionWithMessage() {
        String errorMessage = "Admin authentication failed";
        AdminAuthenticationFailureException exception = new AdminAuthenticationFailureException(errorMessage);
        assertEquals(errorMessage, exception.getMessage());
    }

    @Test
     void testAdminAuthenticationFailureExceptionWithDifferentMessages() {
        String errorMessage1 = "Admin authentication failed";
        String errorMessage2 = "Invalid admin credentials";
        AdminAuthenticationFailureException exception1 = new AdminAuthenticationFailureException(errorMessage1);
        AdminAuthenticationFailureException exception2 = new AdminAuthenticationFailureException(errorMessage2);
        assertEquals(errorMessage1, exception1.getMessage());
        assertEquals(errorMessage2, exception2.getMessage());
    }

    @Test
    void testAdminAuthenticationFailureExceptionWithoutMessage() {
        AdminAuthenticationFailureException exception = new AdminAuthenticationFailureException(null);
        assertNull(exception.getMessage());
    }

    @Test
     void testAdminAuthenticationFailureExceptionIsRuntimeException() {
        AdminAuthenticationFailureException exception = new AdminAuthenticationFailureException(null);
        assertTrue(exception instanceof RuntimeException);
    }

    @Test
     void testAdminAuthenticationFailureExceptionIsException() {
        AdminAuthenticationFailureException exception = new AdminAuthenticationFailureException(null);
        assertTrue(exception instanceof Exception);
    }

    @Test
     void testAdminAuthenticationFailureExceptionIsThrowable() {
        AdminAuthenticationFailureException exception = new AdminAuthenticationFailureException(null);
        assertTrue(exception instanceof Throwable);
    }
    
    

        @Test
        void testAdminEmailNotExistingWithMessage() {
            String errorMessage = "Admin email does not exist";
            AdminEmailNotExisting exception = new AdminEmailNotExisting(errorMessage);
            assertEquals(errorMessage, exception.getMessage());
        }

        @Test
         void testAdminEmailNotExistingWithDifferentMessages() {
            String errorMessage1 = "Admin email does not exist";
            String errorMessage2 = "Invalid admin email";
            AdminEmailNotExisting exception1 = new AdminEmailNotExisting(errorMessage1);
            AdminEmailNotExisting exception2 = new AdminEmailNotExisting(errorMessage2);
            assertEquals(errorMessage1, exception1.getMessage());
            assertEquals(errorMessage2, exception2.getMessage());
        }

        @Test
         void testAdminEmailNotExistingWithoutMessage() {
            AdminEmailNotExisting exception = new AdminEmailNotExisting(null);
            assertNull(exception.getMessage());
        }

        @Test
         void testAdminEmailNotExistingIsRuntimeException() {
            AdminEmailNotExisting exception = new AdminEmailNotExisting(null);
            assertTrue(exception instanceof RuntimeException);
        }

        @Test
        void testAdminEmailNotExistingIsException() {
            AdminEmailNotExisting exception = new AdminEmailNotExisting(null);
            assertTrue(exception instanceof Exception);
        }

        @Test
        void testAdminEmailNotExistingIsThrowable() {
            AdminEmailNotExisting exception = new AdminEmailNotExisting(null);
            assertTrue(exception instanceof Throwable);
        }
        
        
        
            @Test
            void testAdminNotFoundExceptionWithMessage() {
                String errorMessage = "Admin not found";
                AdminNotFoundException exception = new AdminNotFoundException(errorMessage);
                assertEquals(errorMessage, exception.getMessage());
            }

            @Test
           void testAdminNotFoundExceptionWithDifferentMessages() {
                String errorMessage1 = "Admin not found";
                String errorMessage2 = "Invalid admin ID";
                AdminNotFoundException exception1 = new AdminNotFoundException(errorMessage1);
                AdminNotFoundException exception2 = new AdminNotFoundException(errorMessage2);
                assertEquals(errorMessage1, exception1.getMessage());
                assertEquals(errorMessage2, exception2.getMessage());
            }

            @Test
             void testAdminNotFoundExceptionWithoutMessage() {
                AdminNotFoundException exception = new AdminNotFoundException(null);
                assertNull(exception.getMessage());
            }

            @Test
           void testAdminNotFoundExceptionIsRuntimeException() {
                AdminNotFoundException exception = new AdminNotFoundException(null);
                assertTrue(exception instanceof RuntimeException);
            }

            @Test
           void testAdminNotFoundExceptionIsException() {
                AdminNotFoundException exception = new AdminNotFoundException(null);
                assertTrue(exception instanceof Exception);
            }

            @Test
        void testAdminNotFoundExceptionIsThrowable() {
                AdminNotFoundException exception = new AdminNotFoundException(null);
                assertTrue(exception instanceof Throwable);
            }
           

                @Test
                 void testEmailNotExistingExceptionWithMessage() {
                    String errorMessage = "Email does not exist";
                    EmailNotExistingException exception = new EmailNotExistingException(errorMessage);
                    assertEquals(errorMessage, exception.getMessage());
                }

                @Test
                 void testEmailNotExistingExceptionWithDifferentMessages() {
                    String errorMessage1 = "Email does not exist";
                    String errorMessage2 = "Invalid email format";
                    EmailNotExistingException exception1 = new EmailNotExistingException(errorMessage1);
                    EmailNotExistingException exception2 = new EmailNotExistingException(errorMessage2);
                    assertEquals(errorMessage1, exception1.getMessage());
                    assertEquals(errorMessage2, exception2.getMessage());
                }

                @Test
               void testEmailNotExistingExceptionWithoutMessage() {
                    EmailNotExistingException exception = new EmailNotExistingException(null);
                    assertNull(exception.getMessage());
                }

                @Test
                 void testEmailNotExistingExceptionIsRuntimeException() {
                    EmailNotExistingException exception = new EmailNotExistingException(null);
                    assertTrue(exception instanceof RuntimeException);
                }

                @Test
                 void testEmailNotExistingExceptionIsException() {
                    EmailNotExistingException exception = new EmailNotExistingException(null);
                    assertTrue(exception instanceof Exception);
                }

                @Test
               void testEmailNotExistingExceptionIsThrowable() {
                    EmailNotExistingException exception = new EmailNotExistingException(null);
                    assertTrue(exception instanceof Throwable);
                }
                
                
                
               
                    @Test
                    void testExchangeRateNotFoundExceptionWithMessage() {
                        String errorMessage = "Exchange rate not found";
                        ExchangeRateNotFoundException exception = new ExchangeRateNotFoundException(errorMessage);
                        assertEquals(errorMessage, exception.getMessage());
                    }

                    @Test
                    void testExchangeRateNotFoundExceptionWithDifferentMessages() {
                        String errorMessage1 = "Exchange rate not found for currency pair A/B";
                        String errorMessage2 = "Exchange rate not found for currency pair X/Y";
                        ExchangeRateNotFoundException exception1 = new ExchangeRateNotFoundException(errorMessage1);
                        ExchangeRateNotFoundException exception2 = new ExchangeRateNotFoundException(errorMessage2);
                        assertEquals(errorMessage1, exception1.getMessage());
                        assertEquals(errorMessage2, exception2.getMessage());
                    }

                    @Test
                    void testExchangeRateNotFoundExceptionWithoutMessage() {
                        ExchangeRateNotFoundException exception = new ExchangeRateNotFoundException(null);
                        assertNull(exception.getMessage());
                    }

                    @Test
                     void testExchangeRateNotFoundExceptionIsRuntimeException() {
                        ExchangeRateNotFoundException exception = new ExchangeRateNotFoundException(null);
                        assertTrue(exception instanceof RuntimeException);
                    }

                    @Test
                    void testExchangeRateNotFoundExceptionIsException() {
                        ExchangeRateNotFoundException exception = new ExchangeRateNotFoundException(null);
                        assertTrue(exception instanceof Exception);
                    }

                    @Test
                     void testExchangeRateNotFoundExceptionIsThrowable() {
                        ExchangeRateNotFoundException exception = new ExchangeRateNotFoundException(null);
                        assertTrue(exception instanceof Throwable);
                    }
                    
                   
                        @Test
                         void testInvalidAccountExceptionWithMessage() {
                            String errorMessage = "Invalid account";
                            InvalidAccountException exception = new InvalidAccountException(errorMessage);
                            assertEquals(errorMessage, exception.getMessage());
                        }

                        @Test
                        void testInvalidAccountExceptionWithDifferentMessages() {
                            String errorMessage1 = "Account not found";
                            String errorMessage2 = "Invalid account type";
                            InvalidAccountException exception1 = new InvalidAccountException(errorMessage1);
                            InvalidAccountException exception2 = new InvalidAccountException(errorMessage2);
                            assertEquals(errorMessage1, exception1.getMessage());
                            assertEquals(errorMessage2, exception2.getMessage());
                        }

                        @Test
                        void testInvalidAccountExceptionWithoutMessage() {
                            InvalidAccountException exception = new InvalidAccountException(null);
                            assertNull(exception.getMessage());
                        }

                        @Test
                        void testInvalidAccountExceptionIsRuntimeException() {
                            InvalidAccountException exception = new InvalidAccountException(null);
                            assertTrue(exception instanceof RuntimeException);
                        }

                        @Test
                      void testInvalidAccountExceptionIsException() {
                            InvalidAccountException exception = new InvalidAccountException(null);
                            assertTrue(exception instanceof Exception);
                        }

                        @Test
                         void testInvalidAccountExceptionIsThrowable() {
                            InvalidAccountException exception = new InvalidAccountException(null);
                            assertTrue(exception instanceof Throwable);
                        }
                        
                        
                        
                       
                          @Test
                             void testTransactionNotFoundExceptionWithMessage() {
                                String errorMessage = "Transaction not found";
                                TransactionNotFoundException exception = new TransactionNotFoundException(errorMessage);
                                assertEquals(errorMessage, exception.getMessage());
                            }

                            @Test
                            void testTransactionNotFoundExceptionWithDifferentMessages() {
                                String errorMessage1 = "Invalid transaction ID";
                                String errorMessage2 = "Transaction expired";
                                TransactionNotFoundException exception1 = new TransactionNotFoundException(errorMessage1);
                                TransactionNotFoundException exception2 = new TransactionNotFoundException(errorMessage2);
                                assertEquals(errorMessage1, exception1.getMessage());
                                assertEquals(errorMessage2, exception2.getMessage());
                            }

                            @Test
                             void testTransactionNotFoundExceptionWithoutMessage() {
                                TransactionNotFoundException exception = new TransactionNotFoundException(null);
                                assertNull(exception.getMessage());
                            }

                            @Test
                             void testTransactionNotFoundExceptionIsRuntimeException() {
                                TransactionNotFoundException exception = new TransactionNotFoundException(null);
                                assertTrue(exception instanceof RuntimeException);
                            }

                            @Test
                            void testTransactionNotFoundExceptionIsException() {
                                TransactionNotFoundException exception = new TransactionNotFoundException(null);
                                assertTrue(exception instanceof Exception);
                            }

                            @Test
                            void testTransactionNotFoundExceptionIsThrowable() {
                                TransactionNotFoundException exception = new TransactionNotFoundException(null);
                                assertTrue(exception instanceof Throwable);
                            }
                            
                            
                            
                           

                                @Test
                                void testUserBankDetailsNotFoundExceptionWithMessage() {
                                    String errorMessage = "User bank details not found";
                                    UserBankDetailsNotFoundException exception = new UserBankDetailsNotFoundException(errorMessage);
                                    assertEquals(errorMessage, exception.getMessage());
                                }

                                @Test
                                 void testUserBankDetailsNotFoundExceptionWithDifferentMessages() {
                                    String errorMessage1 = "Invalid user ID";
                                    String errorMessage2 = "Bank details not available";
                                    UserBankDetailsNotFoundException exception1 = new UserBankDetailsNotFoundException(errorMessage1);
                                    UserBankDetailsNotFoundException exception2 = new UserBankDetailsNotFoundException(errorMessage2);
                                    assertEquals(errorMessage1, exception1.getMessage());
                                    assertEquals(errorMessage2, exception2.getMessage());
                                }

                                @Test
                                 void testUserBankDetailsNotFoundExceptionWithoutMessage() {
                                    UserBankDetailsNotFoundException exception = new UserBankDetailsNotFoundException(null);
                                    assertNull(exception.getMessage());
                                }

                                @Test
                                void testUserBankDetailsNotFoundExceptionIsRuntimeException() {
                                    UserBankDetailsNotFoundException exception = new UserBankDetailsNotFoundException(null);
                                    assertTrue(exception instanceof RuntimeException);
                                }

                                @Test
                                void testUserBankDetailsNotFoundExceptionIsException() {
                                    UserBankDetailsNotFoundException exception = new UserBankDetailsNotFoundException(null);
                                    assertTrue(exception instanceof Exception);
                                }

                                @Test
                                void testUserBankDetailsNotFoundExceptionIsThrowable() {
                                    UserBankDetailsNotFoundException exception = new UserBankDetailsNotFoundException(null);
                                    assertTrue(exception instanceof Throwable);
                                }
                                
                                
                                
                                    @Test
                                     void testUsersEmailNotExistingExceptionWithMessage() {
                                        String errorMessage = "User email not existing";
                                        UsersEmailNotExistingException exception = new UsersEmailNotExistingException(errorMessage);
                                        assertEquals(errorMessage, exception.getMessage());
                                    }

                                    @Test
                                     void testUsersEmailNotExistingExceptionWithDifferentMessages() {
                                        String errorMessage1 = "Invalid email format";
                                        String errorMessage2 = "Email does not belong to any user";
                                        UsersEmailNotExistingException exception1 = new UsersEmailNotExistingException(errorMessage1);
                                        UsersEmailNotExistingException exception2 = new UsersEmailNotExistingException(errorMessage2);
                                        assertEquals(errorMessage1, exception1.getMessage());
                                        assertEquals(errorMessage2, exception2.getMessage());
                                    }

                                    @Test
                                   void testUsersEmailNotExistingExceptionWithoutMessage() {
                                        UsersEmailNotExistingException exception = new UsersEmailNotExistingException(null);
                                        assertNull(exception.getMessage());
                                    }

                                    @Test
                                     void testUsersEmailNotExistingExceptionIsRuntimeException() {
                                        UsersEmailNotExistingException exception = new UsersEmailNotExistingException(null);
                                        assertTrue(exception instanceof RuntimeException);
                                    }

                                    @Test
                                    void testUsersEmailNotExistingExceptionIsException() {
                                        UsersEmailNotExistingException exception = new UsersEmailNotExistingException(null);
                                        assertTrue(exception instanceof Exception);
                                    }

                                    @Test
                                  void testUsersEmailNotExistingExceptionIsThrowable() {
                                        UsersEmailNotExistingException exception = new UsersEmailNotExistingException(null);
                                        assertTrue(exception instanceof Throwable);
                                    }
                                    
                                    
                                    

                                        @Test
                                        void testUsersNotFoundExceptionWithMessage() {
                                            String errorMessage = "Users not found";
                                            UsersNotFoundException exception = new UsersNotFoundException(errorMessage);
                                            assertEquals(errorMessage, exception.getMessage());
                                        }

                                        @Test
                                         void testUsersNotFoundExceptionWithDifferentMessages() {
                                            String errorMessage1 = "Invalid user ID";
                                            String errorMessage2 = "User not found in the database";
                                            UsersNotFoundException exception1 = new UsersNotFoundException(errorMessage1);
                                            UsersNotFoundException exception2 = new UsersNotFoundException(errorMessage2);
                                            assertEquals(errorMessage1, exception1.getMessage());
                                            assertEquals(errorMessage2, exception2.getMessage());
                                        }

                                        @Test
                                        void testUsersNotFoundExceptionWithoutMessage() {
                                            UsersNotFoundException exception = new UsersNotFoundException(null);
                                            assertNull(exception.getMessage());
                                        }

                                        @Test
                                        void testUsersNotFoundExceptionIsRuntimeException() {
                                            UsersNotFoundException exception = new UsersNotFoundException(null);
                                            assertTrue(exception instanceof RuntimeException);
                                        }

                                        @Test
                                         void testUsersNotFoundExceptionIsException() {
                                            UsersNotFoundException exception = new UsersNotFoundException(null);
                                            assertTrue(exception instanceof Exception);
                                        }

                                        @Test
                                         void testUsersNotFoundExceptionIsThrowable() {
                                            UsersNotFoundException exception = new UsersNotFoundException(null);
                                            assertTrue(exception instanceof Throwable);
                                        }
                                    }

                                

                            

                        

                    

                

            

        

    


