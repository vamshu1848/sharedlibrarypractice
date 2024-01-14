def call(tcip, username, credid, warname){
sshagent(['credid']) {
                    sh "scp -o StrictHostKeyChecking=no target/${warname} ${username}@${tcip}:/opt/tomcat9/webapps/"
                    sh "ssh ${username}@${tcip} /opt/tomcat9/bin/shutdown.sh"
                    sh "ssh ${username}@${tcip} /opt/tomcat9/bin/startup.sh"
}
}
