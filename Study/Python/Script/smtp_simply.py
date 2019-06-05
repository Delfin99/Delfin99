import smtplib

email = 'wjdtmdrl12@gmail.com'
pwd = 'gokos7lovepp'
to = 'wjdtmdrl12@gmail.com'
message = 'This is my message - Simply' 

# connect to the server
server = smtplib.SMTP('smtp.gmail.com')

# use TLS
server.starttls()

server.login(email, pwd)
server.sendmail(email, to, message)

# logout of the email server
server.quit()

