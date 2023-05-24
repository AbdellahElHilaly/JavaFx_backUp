repo=$1

git init
git add .
git commit -m "first commit"
git branch -M main
git remote add origin https://github.com/AbdellahElHilaly/$repo.git
git push -u origin main