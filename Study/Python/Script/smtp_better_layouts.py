import smtplib

# Multipurpose Internet Mail Extensions
from email.mime.text import MIMEText
from email.mime.multipart import MIMEMultipart

email = 'wjdtmdrl12@gmail.com'
pwd = 'gokos7lovepp'
to = 'wjdtmdrl12@gmail.com'
subject = 'This is the subject' 
message = 'This is my message - better layouts'

msg = MIMEMultipart()
msg['From'] = email
msg['To'] = to
msg['Subject'] = subject

# Attach the message to the MIMEMultipart object
msg.attach(MIMEText(message, 'plain'))

server = smtplib.SMTP('smtp.gmail.com')
server.starttls()
server.login(email, pwd)

# You now need to convert the MIMEMultipart object to a string to send
text = msg.as_string()

server.sendmail(email, to, text)
server.quit()

