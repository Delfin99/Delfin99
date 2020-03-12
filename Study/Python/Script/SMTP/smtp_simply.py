import smtplib

email = ''
pwd = ''
to = ''
message = 'This is my message - Simply' 

# connect to the server
server = smtplib.SMTP('smtp.gmail.com')

# use TLS
server.starttls()

server.login(email, pwd)
server.sendmail(email, to, message)

# logout of the email server
server.quit()

