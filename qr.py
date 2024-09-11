import qrcode
from PIL import Image

try:
    data = input("Enter anything to generate QR :")
    qr = qrcode.QRCode(version=2, box_size=10, border=5)
    qr.add_data(data)
    qr.make()
    image = qr.make_image(fill="black", back_color="white")
    image.save("qr_code.png")    
    # Open and display the image
    image = Image.open("qr_code.png")
    image.show()  # This will open the image using the default image viewer
except Exception as e:
    print(f"An error occurred: {e}")
