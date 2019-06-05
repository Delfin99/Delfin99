import smtplib
from email.mime.text import MIMEText
from email.mime.multipart import MIMEMultipart

from email.mime.base import MIMEBase
from email import encoders

import os.path

email = ''
pwd = ''
to = ''
subject = 'This is the subject' 
message = 'This is my message - attachments'
file_location = '/Users/jeong/Delfin99/Study/Python/Scipt/attach.txt'

msg = MIMEMultipart()
msg['From'] = email
msg['To'] = to
msg['Subject'] = subject

msg.attach(MIMEText(message, 'plain'))

filename = os.path.basename(file_location)
attachment = open(file_location, "rb")
part = MIMEBase('application', 'octect-stream')
part.set_payload(attachment.read())
encoders.encode_base64(part)
part.add_header('Content-Disposition', "attachment; filename = %s" % filename)

msg.attach(part)

server = smtplib.SMTP('smtp.gmail.com')
server.starttls()
server.login(email, pwd)
text = msg.as_string()
server.sendmail(email, to, text)
server.quit()

