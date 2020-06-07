pipeline {  
    agent any  
    stages {  
            stage ('Build') {  
                steps{
                    echo "build successful";
                } 
            }  
            stage ('Test') {  
                  steps{
                    echo "test successful";
                } 
            }  
            stage ('QA') {  
                 steps{
                    echo "QA successful";
                }   
            }  
            stage ('Deploy') {  
                 steps{
                    echo "deploy successful";
                }  
            }  
            stage ('Monitor') {  
                 steps{
                    echo "monitor successful";
                }   
            }  
    }  
} 
